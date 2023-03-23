package module_2_apj.molel.person;

import module_2_apj.molel.bookingorcontract.Cha3CuaBokingContract;

//Số hợp đồng, mã booking, Số tiền cọc trước, Tổng số tiền thanh toán, mã khách hàng.
//  hợp đồng của khách hàng.
public class Customer extends PersonCha {
    String loaiKach;
    String diaChi;



    public Customer() {
    }

    public Customer(String name, String gender, int codee, int birday, int sdt, int cmnd, String email, String loaiKach, String diaChi) {
        super(name, gender, codee, birday, sdt, cmnd, email);
        this.loaiKach = loaiKach;
        this.diaChi = diaChi;
    }

    public String getLoaiKach() {
        return loaiKach;
    }

    public void setLoaiKach(String loaiKach) {
        this.loaiKach = loaiKach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                " name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", codee=" + codee +
                ", birday='" + birday + '\'' +
                ", sdt=" + sdt +
                ", cmnd=" + cmnd +
                ", email='" + email + '\'' +
                ",loaiKach='" + loaiKach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}