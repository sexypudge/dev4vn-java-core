

        public class test {
            public static void main(String[] args) {
                int n = 4; // Chiều cao của tháp (theo hình là 4 dòng)

                // Vòng lặp chạy từng dòng (i)
                for (int i = 1; i <= n; i++) {

                    // --- VÒNG LẶP 1: IN KHOẢNG TRẮNG ---
                    // Số khoảng trắng giảm dần: n-1, n-2,...
                    for (int j = 1; j <= n - i; j++) {
                        System.out.print("++"); // Lưu ý: Dùng 2 dấu cách để hình trông cân đối hơn
                    }

                    // --- VÒNG LẶP 2: IN NGÔI SAO ---
                    // Số ngôi sao là số lẻ tăng dần: 1, 3, 5, 7... (công thức: 2*i - 1)
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("* "); // In sao kèm 1 dấu cách để các sao không dính chặt
                    }

                    // Xuống dòng sau khi in xong 1 hàng
                    System.out.println();
                }
            }
        }

