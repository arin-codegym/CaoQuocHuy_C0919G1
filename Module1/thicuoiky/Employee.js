let Employee= function () {
    this.TenLogin=function (tenlogin) {
        this.tenlogin=tenlogin;
    };
    this.getTenLogin=function () {
        return this.tenlogin;
    };
    this.TenNv=function (ten) {
        this.tennv = ten;

    };
    this.getTenNv=function () {
        return this.tennv;
    } ; this.Pass=function (pass) {
        this.pass= pass;
    };
    this.getPass=function () {
        return this.pass;
    };
    this.NgaySinh=function (ngaysinh) {
        this.namelogin=ngaysinh;
    };
    this.getNgaySinh=function () {
        return this.namelogin;
    };    this.Cmnd=function (cmnd) {
        this.cmnd=cmnd;
    };
    this.getCmnd=function () {
        return this.cmnd;
    };    this.GioiTinh=function (gioitinh) {
        this.gioitinh=gioitinh;
    };
    this.getGioiTinh=function () {
        return this.gioitinh;
    };    this.DiaChi=function (diachi) {
        this.diachi=diachi;
    };
    this.getDiaCHi=function () {
        return this.diachi;
    };    this.SoDienThoai=function (sodienthoai) {
        this.sodienthoai=sodienthoai;
    };
    this.getSoDienThoai=function () {
        return this.sodienthoai;
    };
    this.Email=function (email) {
        this.email=email;
    }
    this.getEmail=function () {
        return this.email;
    }
}