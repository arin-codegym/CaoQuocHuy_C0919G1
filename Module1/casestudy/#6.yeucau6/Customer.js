let Customer = function () {
    this.setNameCustomer = function (name) {
        this.nameCustomer = name;
    };
    this.getNameCustomer = function () {
        return this.nameCustomer;
    };
    this.setIsCard = function (isCard) {
        this.isCard = isCard;
    };
    this.getIsCard = function () {
        return this.isCard;
    };
    this.setBirthDayCustomer = function (birthday) {
        this.birthday = birthday;
    };
    this.getBirthDayCustomer = function () {
        return this.birthday;
    };
    this.setEmail = function (email) {
        this.email = email;
    };
    this.getEmail = function () {
        return this.email;
    };
    this.setAddress = function (address) {
        this.address = address;
    };
    this.getAddress = function () {
        return this.address;
    };
    this.setDiscount = function (discount) {
        this.discount = discount;
    };
    this.getDiscount = function () {
        return this.discount;
    };
    this.setTypeCustomer = function (typeCustomer) {
        this.typeCustomer = typeCustomer;};
    this.getTypeCustomer = function () {
        return this.typeCustomer;
    };
    this.setAcompany =function (acompany) {
        this.acompany = acompany;
    };
    this.getAcompany = function () {
        return this.acompany;
    };
    this.setRentDays = function (rentDays) {
        this.rentDays = rentDays;
    };
    this.getRentDays = function () {
        return this.rentDays;
    };
    this.setTypeService = function (typeService) {
        this.typeService = typeService;
    };
    this.getTypeService = function () {
        return this.typeService;
    };
    this.setTypeRoom = function (typeRoom) {
        this.typeRoom = typeRoom;
    };
    this.getTypeRoom = function () {
        return this.typeRoom;
    };
    this.payForRoom = function () {
        let moneyPerson = 0;
        if (this.getTypeService() === "Villa") {
            moneyPerson = 500;        }
        else if (this.getTypeService === "House") {
            moneyPerson =300;
        }else {
            moneyPerson =200;
        }
        return moneyPerson * parseFloat(this.getRentDays())*(1-(parseFloat(this.getDiscount())/100));

    };


};
let Employees =function () {
    this.setEmployeesName =function (EmployeesName) {
        this.EmployeesName =EmployeesName;
    };
    this.getEmployeesName =function () {
        return  this.EmployeesName ;
    };
    this.setBirthdayEmployees =function (BirthdayEmployees) {
        this.BirthdayEmployees =BirthdayEmployees;
    };
    this.getBirthdayEmployees =function () {
        return  this.BirthdayEmployees ;
    };
    this.setIsCardEmployees =function (IsCardEmployees) {
        this.IsCardEmployees =IsCardEmployees;
    };
    this.getIsCardEmployees =function () {
        return  this.IsCardEmployees ;
    };
    this.setPhoneNumberEmployees =function (PhoneNumberEmployees) {
        this.PhoneNumberEmployees =PhoneNumberEmployees;
    };
    this.getPhoneNumberEmployees =function () {
        return  this.PhoneNumberEmployees ;
    };
    this.setEmailEmployees =function (EmailEmployees) {
        this.EmailEmployees =EmailEmployees;
    };
    this.getEmailEmployees =function () {
        return  this.EmailEmployees ;
    };
    this.setAcademicLevelEmployees =function (AcademicLevelEmployees) {
        this.AcademicLevelEmployees =AcademicLevelEmployees;
    };
    this.getAcademicLevelEmployees =function () {
        return  this.AcademicLevelEmployees ;
    };
    this.setJobPositionEmployees =function (JobPositionEmployees) {
        this.JobPositionEmployees =JobPositionEmployees;
    };
    this.getJobPositionEmployees =function () {
        return  this.JobPositionEmployees ;
    };
    this.setActualLaborDay =function (ActualLaborDay) {
        this.ActualLaborDay =ActualLaborDay;
    };
    this.getActualLaborDay =function () {
        return this.ActualLaborDay ;
    };
    this.setWorkingParts =function (WorkingParts) {
        this.WorkingParts = WorkingParts;
    };
    this.getWorkingParts =function () {
        return this.WorkingParts ;
    };

    this.getSalaryEmployees =function () {

        let subsidize = 0;
        let positionJob =0;
        if(this.getJobPositionEmployees() ==="Lễ tân"){
            positionJob = 5000;
        }else if (this.getJobPositionEmployees()==="phục vụ"){
            positionJob =4000;
        }else if (this.getJobPositionEmployees()==="chuyên viên"){
            positionJob =6000;
        }else if (this.getJobPositionEmployees()==="Giám sát"){
            positionJob =8000;
        }else if (this.getJobPositionEmployees()==="Quản lí"){
            positionJob = 7500;
        }else if (this.getJobPositionEmployees()==="giám đốc"){
            positionJob =10000;
        }else {positionJob =3000;}
        if (this.getWorkingParts() ==="Manager"){
            subsidize =500;
        }
        if (this.getWorkingParts()==="Sale"){
            subsidize =300;
        }
        else {
            subsidize =200;
        }
        return  (positionJob +subsidize)/26 *parseFloat(this.getActualLaborDay()) ;
    };

};