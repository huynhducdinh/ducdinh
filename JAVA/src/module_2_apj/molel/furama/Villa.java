package module_2_apj.molel.furama;

// Villa   Diện tích hồ bơi
public class Villa extends Cha1CuaFarama {
    String sHoBoi;

    public Villa() {
    }

    public Villa(String tieuChuanPhong, int sotang, String sHoBoi) {
        super(tieuChuanPhong, sotang);
        this.sHoBoi = sHoBoi;
    }

    public String getsHoBoi() {
        return sHoBoi;
    }

    public void setsHoBoi(String sHoBoi) {
        this.sHoBoi = sHoBoi;
    }

    @Override
    public String toString() {
        return "Villa{" +
                " tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ",sotang=" + sotang +
                ",sHoBoi='" + sHoBoi +
                '}';
    }

    public String convertLine4() {
        String COMMA = ",";
        return getTieuChuanPhong() + COMMA + getSotang() + COMMA + getsHoBoi();
    }
}