let listCustomer = [];
let nameCus = document.getElementById("nameCustomer");
let ageCus = document.getElementById("ageCustomer");
let cmndCus = document.getElementById("cmndCustomer");
function saveCustomer() {
    let cus = new Customer();
    cus.setNameCustomer(nameCus.value);
    cus.setAgeCustomer(ageCus.value);
    cus.setCmndCustomer(cmndCus.value);
    listCustomer.push(cus);
    nameCus.value = "";
    ageCus.value = "";
    cmndCus.value = "";
    nameCus.focus();
    alert("Added!!!");
}
function displayCustomer() {
    let result = "";
    for (let i = 0 ; i < listCustomer.length ; i++){
        result += "Name customer : "
            + listCustomer[i].getNameCustomer() +
            "; Age Customer : " + listCustomer[i].getAgeCustomer() +
            "; CMND Customer : " + listCustomer[i].getCmndCustomer()
            + "<br/>";
    }
    document.getElementById("showList").innerHTML = result;
}
