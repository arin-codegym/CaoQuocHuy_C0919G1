let Apple = function () {
    this.setKhoiLuong = function (KhoiLuong) {
        this.KhoiLuong = KhoiLuong;
    };
    this.getKhoiLuong = function () {
        return this.KhoiLuong;
    };
    this.decrease = function () {
        if (this.KhoiLuong > 0) {
            return this.KhoiLuong--;
        }
    }
};
let Human = function () {
    this.setName = function (Name) {
        this.Name = Name;
    };
    this.getName = function () {
        return this.Name;
    };
    this.setGender = function (Gender) {
        this.Gender = Gender;
    };
    this.getGender = function () {
        return this.Gender;
    };
    this.setWeight = function (Weight) {
        this.Weight = Weight;
    };
    this.getWeight = function () {
        return this.Weight;
    };
    this.setSpeak = function (Speak) {
        this.Speak = Speak;
    };
    this.getSpeak = function () {
        return this.Speak;
    };
    this.upWeight = function () {
        if (this.Weight > 0) {
            return this.Weight + 1;
        }

    }
};