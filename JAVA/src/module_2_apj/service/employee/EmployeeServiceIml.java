package module_2_apj.service.employee;

import module_2_apj.molel.person.ComparatorEmployee;
import module_2_apj.molel.person.Employee;

import java.util.*;

public class EmployeeServiceIml implements IEmployessService {

    static Scanner sc = new Scanner(System.in);

    @Override
    public void display() {

    }

    @Override
    public void add() {
        System.out.println("Nhập tên nhân viên");
        String name = sc.nextLine();
        System.out.println("Nhập giới tính nhân viên");
        String gender = sc.nextLine();
//        mã nv ko dc trùng
        int id = inputId();
        System.out.println("Nhập ngày sinh nhân viên");
        int birday = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số điện thoại nhân viên");
        int isnumber = Integer.parseInt(sc.nextLine());
//        cmnd ko dc trùng
        System.out.println("Nhập CMND nhân viên");
        int cmnd = Integer.parseInt(sc.nextLine());
//        email ko dc trùng nè
        System.out.println("Nhập Email nhân viên");
        String email = sc.nextLine();
        String str = trinhDo();
        System.out.println("Nhập Vị trí làm việc nhân viên");
        String viTri = sc.nextLine();
        System.out.println("Nhập Số tiền lương nhân viên");
        String luong = sc.nextLine();
        Employee employee = (new Employee(name, gender, id, birday, isnumber, cmnd, email, str, viTri, luong));
//       employees.add(employee);
    }

    public static int inputId() {

        System.out.println("nhập mã nhân viên");
        while (true) {
            try {
              int  code = Integer.parseInt(sc.nextLine());
                return code;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + "phải là số ");
                System.out.println("nhập lại mã nhân viên");
            }
        }
    }
//    }

    public static String trinhDo() {
        System.out.println("Nhập Trình độ nhân viên");
        String trinhDo = sc.nextLine();
        switch (trinhDo) {
            case "1":
                return "Trung cấp";
            case "2":
                return "Cao đẳng";
            case "3":
                return "Đại học";
            case "4":
                return "Sau đại học";
        }

        return trinhDo;
    }

    @Override
    public void update() {
//        System.out.println("nhập mã cần sửa :");
//        int codee = Integer.parseInt(sc.nextLine());
//        for (int i = 0; i < employees.size(); i++) {
//            if (employees.get(i).getCodee() == codee) {
//                System.out.println("Nhập tên nhân viên");
//                String name = sc.nextLine();
//                System.out.println("Nhập giới tính nhân viên");
//                String gender = sc.nextLine();
////        mã nv ko dc trùng
//                System.out.println("Nhập mã nhân nhân viên");
//                int code = Integer.parseInt(sc.nextLine());
//                System.out.println("Nhập ngày sinh nhân viên");
//                int birday = Integer.parseInt(sc.nextLine());
//                System.out.println("Nhập số điện thoại nhân viên");
//                int isnumber = Integer.parseInt(sc.nextLine());
////        cmnd ko dc trùng
//                System.out.println("Nhập CMND nhân viên");
//                int cmnd = Integer.parseInt(sc.nextLine());
////        email ko dc trùng nè
//                System.out.println("Nhập Email nhân viên");
//                String email = sc.nextLine();
//                System.out.println("Nhập Trình độ nhân viên");
//                String trinhDo = sc.nextLine();
//                System.out.println("Nhập Vị trí làm việc nhân viên");
//                String viTri = sc.nextLine();
//                System.out.println("Nhập Số tiền lương nhân viên");
//                String luong = sc.nextLine();
//                employees.set(i, new Employee(name, gender, code, birday, isnumber, cmnd, email, trinhDo, viTri, luong));
//                break;
//            }
//        }
    }

    @Override
    public void delete() {
//        System.out.println("nhập mã cần xoá :");
//        int code = Integer.parseInt(sc.nextLine());
//        for (int i = 0; i < employees.size(); i++) {
//            if (employees.get(i).getCodee() == code) {
//                System.out.println("Bạn có muốn xoá  Mã  " + code + " này ko  " +
//                        "\n 1. Có" +
//                        "\n 2. Không");
//                System.out.println("Chọn chức năng");
//                int choss = Integer.parseInt(sc.nextLine());
//                switch (choss) {
//                    case 1:
//                        employees.remove(employees.get(i));
//                        System.out.println("Bạn xoá thành công");
//                        break;
//                    case 2:
//                        System.out.println("Bạn đã không xoá");
//                }
//                return;
//            }
//        }
//        System.out.println("không tìm thấy mã học viên");
    }


}
