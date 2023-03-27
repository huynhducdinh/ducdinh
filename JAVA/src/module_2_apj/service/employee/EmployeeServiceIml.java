package module_2_apj.service.employee;
import module_2_apj.molel.person.Employee;
import module_2_apj.util.ReadAndWrite;
import module_2_apj.util.read_file.EmployeesReadFile;
import module_2_apj.util.wrtie_file.EmployeesWriteFile;

import java.util.*;

public class EmployeeServiceIml implements IEmployessService {
    static Scanner sc = new Scanner(System.in);
    static Employee employee = new Employee();
    private final String EMPLOYEE_LIST_PATH = "src\\module_2_apj\\data\\employee.csv";

    private void writeFile(List<Employee> employeeList) {
        EmployeesWriteFile.writeFile(EMPLOYEE_LIST_PATH, employeeList);
    }

    @Override
    public void display() {
        List<Employee> employeeList1 = EmployeesReadFile.readEmployee(EMPLOYEE_LIST_PATH);
        for (Employee e : employeeList1) {
            System.out.println(e);
        }
    }

    @Override
    public void add() {
        List<Employee> employeeList2 = EmployeesReadFile.readEmployee(EMPLOYEE_LIST_PATH);
        System.out.println("Nhập tên nhân viên");
        String name = sc.nextLine();
        System.out.println("Nhập giới tính nhân viên");
        String gender = sc.nextLine();
        int id = inputId();
        System.out.println("Nhập ngày sinh nhân viên");
        int birday = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số điện thoại nhân viên");
        int isnumber = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập CMND nhân viên");
        int cmnd = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Email nhân viên");
        String email = sc.nextLine();
        String str = trinhDo();
        String viTri=viTri();
        System.out.println("Nhập Số tiền lương nhân viên");
        String luong = sc.nextLine();
        Employee employee = (new Employee(name, gender, id, birday, isnumber, cmnd, email, str, viTri, luong));
        employeeList2.add(employee);
        writeFile(employeeList2);
    }

    public static int inputId() {
        System.out.println("nhập mã nhân viên");
        while (true) {
            try {
                int code = Integer.parseInt(sc.nextLine());
                return code;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + "phải là số ");
                System.out.println("nhập lại mã nhân viên");
            }
        }
    }

    public static String trinhDo() {
        System.out.println("Chọn trình độ của bạn"+
                "\n1.Trung Cấp"+
                "\n2.Cao Đẳng"+
                "\n3.Đại Học"+
                "\n4.Sau Đại Học");
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
    public static String viTri(){
        System.out.println("Chọn Công việc vủa bạn"+
                "\n1.Lễ tân"+
                "\n2.phục vụ"+
                "\n3.chuyên viên"+
                "\n4.giám sát"+
                "\n5.quản lý"+
                "\n6.giám đốc");
        System.out.println("Chọn công việc bạn làm tại Furama");
        String pos=sc.nextLine();
        switch (pos){
            case "1":
                return "Lễ Tân";
            case "2":
                return "Phục Vụ";
            case "3":
                return "Chuyên Viên";
            case "4":
                return "Giám Sát";
            case "5":
                return "Quản Lí";
            case "6":
                return "Giám Đốc";
        }
        return pos;
    }

    @Override
    public void update() {
        List<Employee> employeeList3 = EmployeesReadFile.readEmployee(EMPLOYEE_LIST_PATH);
        System.out.println("nhập mã cần sửa :");
        int codee = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < employeeList3.size(); i++) {
            if (employeeList3.get(i).getCodee() == codee) {
                System.out.println("Nhập lại tên nhân viên mới");
                String name = sc.nextLine();
                System.out.println("Nhập lại giới tính nhân viên mới");
                String gender = sc.nextLine();
                System.out.println("Nhập lại mã nhân nhân viên mới");
                int code = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập lại ngày sinh nhân viên mới");
                int birday = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập lại số điện thoại nhân viên mới");
                int isnumber = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập lại CMND nhân viên mới");
                int cmnd = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập lại Email nhân viên mới");
                String email = sc.nextLine();
                String trinhDo = trinhDo();
                String viTri=viTri();
                System.out.println("Nhập lại Số tiền lương nhân viên mới");
                String luong = sc.nextLine();
                employeeList3.set(i, new Employee(name, gender, code, birday, isnumber, cmnd, email, trinhDo, viTri, luong));
                writeFile(employeeList3);
                break;
            }
        }
    }

    @Override
    public void delete() {
        List<Employee> employeeList4 = EmployeesReadFile.readEmployee(EMPLOYEE_LIST_PATH);
        System.out.println("nhập mã cần xoá :");
        int code = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < employeeList4.size(); i++) {
            if (employeeList4.get(i).getCodee() == code) {
                System.out.println("Bạn có muốn xoá  Mã  " + code + " này ko  " +
                        "\n 1. Có" +
                        "\n 2. Không");
                System.out.println("Chọn chức năng");
                int choss = Integer.parseInt(sc.nextLine());
                switch (choss) {
                    case 1:
                        employeeList4.remove(employeeList4.get(i));
                        System.out.println("Bạn xoá thành công");
                        break;
                    case 2:
                        System.out.println("Bạn đã không xoá");
                }
                return;
            }
        }
        System.out.println("không tìm thấy mã học viên");
    }


}
