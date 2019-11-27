let idCard = document.getElementById("idCard");
let fullName = document.getElementById("fullName");
let btnRegister = document.getElementById("btnRegister");
let birthday = document.getElementById("birthday");
let height = document.getElementById("height");
let phone = document.getElementById("phone");
//let checkValid = false;
let listEmployees = [];
let tableList = document.getElementById("showList");
btnRegister.disabled = true;
tableList.style.visibility = "hidden";
function validIdCard() {
    //checkValid = false;
    if (!checkIdCard(idCard.value)) {
        idCard.style.border = "1px solid red";
    } else {
       // checkValid = true;
        idCard.style.border = "1px solid green";
    }
    checkBtnRegister();
}

function checkBtnRegister() {
    if (checkValid) {
        btnRegister.disabled = false;
    } else {
        btnRegister.disabled = true;
    }
}

function Register() {
    var emp = new Employee();
    emp.setFullName(fullName.value);
    emp.setBirthday(birthday.value);
    emp.setHeight(height.value);
    emp.setPhone(phone.value);
    emp.setIdCard(idCard.value);
    listEmployees.push(emp);
    name.value="";
    birthday.value="";
    height.value="";
    idCard.value="";
    phone.value="";
    btnRegister.disabled = true;
}
function ShowList(){
    tableList.style.visibility = "visible";

    let result = "<tr>\n" +
        "            <th>Id Card</th>\n" +
        "            <th>Birthday</th>\n" +
        "            <th>Height</th>\n" +
        "            <th>Phone</th>\n" +
        "        </tr>";
    for (let i = 0; i < listEmployees.length; i++) {
        result +=
        "<tr><td>"+ listEmployees[i].getIdCard() +
        "</td> <td>"+ listEmployees[i].getBirthday() +
        "</td> <td>"+ listEmployees[i].getHeight() +
        "</td> <td>"+ listEmployees[i].getPhone()+"</td> </tr>"
    }
    tableList.innerHTML = result;
}
function HideList() {
    tableList.style.visibility = "hidden";
}