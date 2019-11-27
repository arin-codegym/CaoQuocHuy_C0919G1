let Customer = function () {
    // age, name ,cmnd
    this.setNameCustomer = function (nameCustomer) {
        this.nameCustomer = nameCustomer;
    };
    this.getNameCustomer = function () {
        return this.nameCustomer;
    };
    this.setAgeCustomer = function (ageCustomer) {
        this.ageCustomer = ageCustomer;
    };
    this.getAgeCustomer = function () {
        return this.ageCustomer;
    };
    this.setCmndCustomer = function (cmndCustomer) {
        this.cmndCustomer = cmndCustomer;
    };
    this.getCmndCustomer = function () {
        return this.cmndCustomer;
    };
};