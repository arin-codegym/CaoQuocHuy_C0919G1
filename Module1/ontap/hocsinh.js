let HocSinh = function () {
    this.Sothutu=function (sothutu) {
        this.sothutu=sothutu;
    };
    this.getSothutu=function () {
        return this.sothutu;
    };
    this.Hovaten=function (hovaten) {
        this.hovaten=hovaten;
    };
    this.getHovaten=function () {
        return this.hovaten;
    } ;
    this.Ngaysinh=function (ngaysinh) {
        this.ngaysinh=ngaysinh;
    };
    this.getNgaysinh=function () {
        return this.ngaysinh;
    };
    this.Diemtrungbinh=function (diemtrungbinh) {
        this.diemtrungbinh=diemtrungbinh;
    };
    this.getDiemtrungbinh=function () {
        return this.diemtrungbinh;
    };
    this.Xeploai=function () {
        if (this.getDiemtrungbinh()>8){
            return "Học sinh giỏi"
        } else if (this.getDiemtrungbinh()>=6.5){
          return "Học sinh khá."
        } else if (this.getDiemtrungbinh()>=5){
           return "Học sinh trung bình."
        } else if (this.getDiemtrungbinh()>=3.5){
           return "Học sinh yếu."
        } else {
           return "Học sinh kém."
        }
    }
};