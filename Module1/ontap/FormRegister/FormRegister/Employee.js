var Employee = function () {
    this.setFullName= function(fullName){
        this.fullName = fullName;
    };
    this.getFullName = function () {
        return this.fullName;
    };
    this.setIdCard= function(idCard){
        this.idCard = idCard;
    };
    this.getIdCard = function () {
        return this.idCard;
    };
    this.setBirthday= function(birthday){
        this.birthday = birthday;
    };
    this.getBirthday = function () {
        return this.birthday;
    };

    this.setHeight= function(height){
        this.height = height;
    };
    this.getHeight = function () {
        return this.height;
    };
    this.setPhone= function(phone){
        this.phone = phone;
    };
    this.getPhone = function () {
        return this.phone;
    };
};