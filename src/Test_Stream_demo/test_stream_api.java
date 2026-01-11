package Test_Stream_demo;
import java.util.*;
import java.util.stream.Collectors;

public class test_stream_api {


    enum Status { NEW, SUBMITTED, REJECTED }

    static class CV {
        String id;
        List<String> skills;
        Status status;

        public CV(String id, List<String> skills, Status status) {
            this.id = id;
            this.skills = skills;
            this.status = status;
        }
    }

    static class Submission {
        String cvId;
        Double score;

        public Submission(String cvId, Double score) {
            this.cvId = cvId;
            this.score = score;
        }
    }

    public static void main(String[] args) {

        List<CV> cvList = Arrays.asList(
                new CV("CV01", Arrays.asList("Java", "SQL"), Status.SUBMITTED),
                new CV("CV02", Arrays.asList("Python", "AI"), Status.NEW),
                new CV("CV03", Arrays.asList("Java", "Spring"), Status.SUBMITTED),
                new CV("CV04", Arrays.asList("C#"), Status.REJECTED)
        );

        List<Submission> submissions = Arrays.asList(
                new Submission("CV01", 8.5),
                new Submission("CV03", 6.0),
                new Submission("CV04", 4.0)
        );




        List<CV> submittedCVs = cvList.stream()
                .filter(cv -> cv.status == Status.SUBMITTED)
                .collect(Collectors.toList());
        System.out.println("1. Submitted CVs: " + submittedCVs.size());


        List<String> ids = cvList.stream()
                .map(cv -> cv.id)
                .collect(Collectors.toList());
        System.out.println("2. All IDs: " + ids);


        List<String> allSkills = cvList.stream()
                .flatMap(cv -> cv.skills.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("3. All Skills: " + allSkills);


        Map<Status, Long> statusCount = cvList.stream()
                .collect(Collectors.groupingBy(cv -> cv.status, Collectors.counting()));
        System.out.println("4. Count by Status: " + statusCount);


        boolean hasJavaDev = cvList.stream()
                .anyMatch(cv -> cv.skills.contains("Java"));
        System.out.println("5. Has Java Dev: " + hasJavaDev);


        double avgScore = submissions.stream()
                .mapToDouble(s -> s.score)
                .average()
                .orElse(0.0);
        System.out.println("6. Average Score: " + avgScore);


        CV firstNewCv = cvList.stream()
                .filter(cv -> cv.status == Status.NEW)
                .findFirst()
                .orElse(null);
        System.out.println("7. First NEW CV: " + (firstNewCv != null ? firstNewCv.id : "None"));
    }
}