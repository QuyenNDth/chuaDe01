import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    private SinhVienService sinhVienService;
    private SinhVien sinhVien;
    @BeforeEach
    void SetUp()
    {
        sinhVienService = new SinhVienService();
        sinhVien = new SinhVien("SV001", "Nguyen Van A", 20, 7.5f, 3, "CNTT");
    }
    @Test
    void ValidInput()
    {
        sinhVienService.suaSinhVien(sinhVien, "Tran Van B", 22, 8.0f, 4, "Kinh Te");
        assertEquals("Tran Van B", sinhVien.ten);
        assertEquals(22,sinhVien.tuoi);
        assertEquals(8.0f,sinhVien.diemTrungBinh);
        assertEquals(4,sinhVien.kyHoc);
        assertEquals("Kinh Te", sinhVien.chuyenNganh);
    }
    @Test
    void TenRong()
    {
        Exception exp = assertThrows(IllegalArgumentException.class,()->{sinhVienService.suaSinhVien(sinhVien,"Tran Van B", 22, 8.0f, 4, "");});
        assertEquals("Thông tin không hợp lệ",exp.getMessage());
    }
    @Test
    void DiemKhongHL()
    {
        Exception exp = assertThrows(IllegalArgumentException.class,()->{sinhVienService.suaSinhVien(sinhVien,"Tran Van B", 22, 11.0f, 4, "CNTT");});
        assertEquals("Dữ liệu nhập vào không hợp lệ",exp.getMessage());
    }
}