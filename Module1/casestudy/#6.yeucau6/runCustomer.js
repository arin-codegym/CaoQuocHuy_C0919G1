function showInformationTableGeneral() {
    let choose = prompt(
        "1.Customer " +
        "\n2.Employees " +
        "\n3.Exit"
    );
    switch (choose) {
        case "1":
            chooseInformationCustomer();
            break;
        case "2":
            chooseInformationEmployee();
            break;
        case "3":
            break;
        default:
            alert("Failed");
            break;
    }
}

showInformationTableGeneral();

function chooseInformationCustomer() {

    let arrListCustomers = [];
    let checkEditCustomer = false;
    let checkDeleteCustomer = false;
    let checkDisplayTotal = false;
    let validateBirth = /^([0-2][0-9]|(3)[0-1])(\/)(((0)[0-9])|((1)[0-2]))(\/)\d{4}$/;
    let email = /^[A-Z0-9._%+-]+@[A-Z0-9-]+.+.[A-Z]{2,4}$/igm;
    let num = /^[\d]{1,}$/;
    let card = /^[\d]{9}$/;

    function displayMenuCustomer() {
        let choose = prompt(
            "1. Add New Customer" + "\n" +
            "2. Display Information Customer" + "\n" +
            "3. Total Pay Customer" + "\n" +
            "4. Edit Information Customer" + "\n" +
            "5. Delete Customer" + "\n" +
            "6. Exit");
        switch (choose) {
            case "1":
                addNewCustomer();
                break;
            case "2":
                displayCustomer();
                break;
            case "3":

                chooseTotalPay();

                break;
            case "4":

                chooseEditCustomer();

                break;
            case "5":
                chooseDeleteCustomer();
                break;
            case "6":
                showInformationTableGeneral();
                break;
            default:
                displayMenuCustomer();
                break;
        }

    }

    function addNewCustomer() {

        let cus = new Customer();
        cus.setNameCustomer(prompt("Enter name customer :"));
        cus.setIsCard(prompt("Enter IsCard customer :"));

        while (!card.test(cus.getIsCard())) {
            alert("id card is invalid !!!");
            cus.setIsCard(prompt("Enter IsCard customer :"));
        }


        cus.setBirthDayCustomer(prompt("Enter birthdayCustomer customer(dd/mm/yyyy :"));
        while (!validateBirth.test(cus.getBirthDayCustomer())) {
            alert("id birthday is invalid !!!");
            cus.setBirthDayCustomer(prompt("Enter birthdayCustomer customer(dd/mm/yyyy :"));
        }
        cus.setEmail(prompt("Enter email customer :"));
        while (!email.test(cus.getEmail())) {
            alert("id birthday is invalid !!!");
            cus.setEmail(prompt("Enter email customer :"));
        }
        cus.setAddress(prompt("Enter address customer :"));
        cus.setRentDays(prompt("Enter rentDays customer :"));
        while (!num.test(cus.getRentDays())) {
            alert("id birthday is invalid !!!");
            cus.setRentDays(prompt("Enter rentDays customer :"));
        }

        cus.setTypeService(prompt("Enter typeService customer :"));
        cus.setTypeRoom(prompt("Enter typeRoom customer :"));
        cus.setAcompany(prompt("Enter accompany customer :"));
        while (!num.test(cus.getAcompany())) {
            alert("id birthday is invalid !!!");
            cus.setAcompany(prompt("Enter accompany customer :"));
        }
        cus.setDiscount(prompt("Enter discount customer :"));
        while (!num.test(cus.getDiscount())) {
            alert("id birthday is invalid !!!");
            cus.setAcompany(prompt("Enter accompany customer :"));
        }
        cus.setTypeCustomer(prompt("Enter TypeCustomer customer :"));
        arrListCustomers.push(cus);
        displayMenuCustomer();
    }

    function displayCustomer() {
        let result = "";
        for (let i = 0; i < arrListCustomers.length; i++) {
            result += "\n" + (i + 1) + "Name : " + arrListCustomers[i].getNameCustomer() +
                ";IsCard : " + arrListCustomers[i].getIsCard();
        }

        result += "\n" + (arrListCustomers.length + 1) + ".Back to Menu";
        let chooseDisplayInfo = prompt(result);
        if (chooseDisplayInfo.toString() !== (arrListCustomers.length + 1).toString()) {

            if (!checkDeleteCustomer && !checkDisplayTotal) {

                displayInformationCustomer(Number.parseInt(chooseDisplayInfo) - 1);
            } else if (checkDeleteCustomer) {

                deleteCustomer(Number.parseInt(chooseDisplayInfo) - 1);

            } else {


                displayTotalPay(Number.parseInt(chooseDisplayInfo) - 1);
            }
        } else {

            checkDisplayTotal = false;
            checkDeleteCustomer = false;
            checkEditCustomer = false;
            displayMenuCustomer();
        }
    }

    function displayInformationCustomer(index) {

        if (checkEditCustomer) {
            let chooseInfoEdit = prompt(
                "1.Name :" + arrListCustomers[index].getNameCustomer() +
                "\n 2.IsCard : " + arrListCustomers[index].getIsCard() +
                "\n 3.birthCustomer : " + arrListCustomers[index].getBirthDayCustomer() +
                "\n 4.emailCustomer : " + arrListCustomers[index].getEmail() +
                "\n 5.addressCustomer : " + arrListCustomers[index].getAddress() +
                "\n 6.typeCustomer : " + arrListCustomers[index].getTypeCustomer() +
                "\n 7.discount : " + arrListCustomers[index].getDiscount() +
                "\n 8.accompany : " + arrListCustomers[index].getAcompany() +
                "\n 9.typeRoom : " + arrListCustomers[index].getTypeRoom() +
                "\n 10.rentDays : " + arrListCustomers[index].getRentDays() +
                "\n 11.serviceType : " + arrListCustomers[index].getTypeService() +
                "\n 12.Back."
            );
            if (chooseInfoEdit.toString() !== "12") {
                editInformationCustomer(index, Number.parseInt(chooseInfoEdit) - 1);

            } else {
                checkEditCustomer = false;
                displayCustomer();
            }
        } else {
            alert("Information of customer :" +
                ".Name :" + arrListCustomers[index].getNameCustomer() +
                "\n .IsCard : " + arrListCustomers[index].getIsCard() +
                "\n .birthCustomer : " + arrListCustomers[index].getBirthDayCustomer() +
                "\n .emailCustomer : " + arrListCustomers[index].getEmail() +
                "\n .addressCustomer : " + arrListCustomers[index].getAddress() +
                "\n .typeCustomer : " + arrListCustomers[index].getTypeCustomer() +
                "\n .discount : " + arrListCustomers[index].getDiscount() +
                "\n .accompany : " + arrListCustomers[index].getAcompany() +
                "\n .typeRoom : " + arrListCustomers[index].getTypeRoom() +
                "\n .rentDays : " + arrListCustomers[index].getRentDays() +
                "\n .serviceType : " + arrListCustomers[index].getTypeService()
            );
        }
        displayMenuCustomer();

    }


    function editInformationCustomer(indexCus, indexPropety) {
        let editInfo = prompt("Enter Info You Want To Change");
        switch (indexPropety) {
            case 0:
                arrListCustomers[indexCus].getNameCustomer(editInfo);
                break;
            case 1:
                arrListCustomers[indexCus].getIsCard(editInfo);
                break;
            case 2:
                arrListCustomers[indexCus].getBirthDayCustomer(editInfo);
                break;
            case 3:
                arrListCustomers[indexCus].getEmail(editInfo);
                break;
            case 4:
                arrListCustomers[indexCus].getAddress(editInfo);
                break;
            case 5:
                arrListCustomers[indexCus].getTypeCustomer(editInfo);
                break;
            case 6:
                arrListCustomers[indexCus].getDiscount(editInfo);
                break;
            case 7:
                arrListCustomers[indexCus].getAcompany(editInfo);
                break;
            case 8:
                arrListCustomers[indexCus].getTypeRoom(editInfo);
                break;
            case 9:
                arrListCustomers[indexCus].getRentDays(editInfo);
                break;
            case 10:
                arrListCustomers[indexCus].getTypeService(editInfo);
                break;
            default:
                alert("Fail");
                return;
        }
        checkEditCustomer = false;
        displayMenuCustomer();
    }

    function chooseDeleteCustomer() {
        checkDeleteCustomer = true;
        displayCustomer();
    }

    function deleteCustomer(index) {
        let chooseConfirm = prompt(
            "Are you sure delete Customer : Name " + arrListCustomers[index].getNameCustomer() +
            "; IsCard :" + arrListCustomers[index].getIsCard() +
            "\n1.Yes\n2.No");
        if (chooseConfirm === "1") {
            arrListCustomers.splice(index, 1);
            alert("Delete Completed");
        }
    }

    function chooseTotalPay() {

        checkDisplayTotal = true;
        displayCustomer();
    }

    function displayTotalPay(index) {
        alert(arrListCustomers[index].payForRoom());
        checkDisplayTotal = false;
        displayMenuCustomer();
    }

    function chooseEditCustomer() {

        checkEditCustomer = true;
        displayCustomer();
    }

    displayMenuCustomer();
}

// function chooseInformationEmployee() {
//     let listEmployees = [];
//     let checkDeleteEmployees =false;
//     let checkEditEmployees =false;
//     let checkDisplaySalary =false;
//     let validateBirth = /^([0-2][0-9]|(3)[0-1])(\/)(((0)[0-9])|((1)[0-2]))(\/)\d{4}$/;
//     let em = /^[A-Z0-9._%+-]+@[A-Z0-9-]+.+.[A-Z]{2,4}$/igm;
//     let num =/^[\d]{1,}$/;
//     let card = /^[\d]{9}$/;
//     let phone =/^0[0-9]{2}[-]+(([0-9]{7})|([0-9]{8}))$/;
//     let workNumberDay =/^(0[1-9]{1})|(1[0-9]{1})|(2[0-9])$/;
//     function displayMenuEmployess() {
//         let choose = prompt(
//             "1. Add New Employees" + "\n" +
//             "2. Display Information Employees" + "\n" +
//             "3. Total Pay Employees" + "\n" +
//             "4. Edit Information Employees" + "\n" +
//             "5. Delete Employees" + "\n" +
//             "6. Exit");
//         switch (choose) {
//             case "1":
//                 addNewEmployees();
//                 break;
//             case "2":
//                 displayEmployees();
//                 break;
//             case "3":
//
//                 choosePaySalary();
//
//
//                 break;
//             case "4":
//
//                 chooseEditEmployees();
//                 break;
//             case "5":
//                 chooseDeleteEmployees();
//                 break;
//             case "6":
//                 showInformationTableGeneral();
//                 break;
//             default:
//                 displayMenuEmployess();
//                 break;
//         }

// }

// function addNewEmployees() {
//     let emp = new Employees();
//
//     emp.setEmployeesName(prompt("Enter Employees Name  :"));
//     emp.setBirthdayEmployees(prompt("Enter Birthday Employees   :"));
//     while (!validateBirth.test(emp.getBirthdayEmployees())){
//         alert("Id birth invalid !!!");
//         emp.setBirthdayEmployees(prompt("Enter Birthday Employees   :"));
//     }
//     emp.setIsCardEmployees(prompt("Enter IsCard Employees(Ex:230230230)   :"));
//     while (!card.test(emp.getIsCardEmployees())){
//         alert("Id card invalid !!!");
//         emp.setIsCardEmployees(prompt("Enter IsCard Employees(Ex:230230230)   :"));
//     }
//     emp.setPhoneNumberEmployees(prompt("Enter Phone Number Employees(035-230230230)   :"));
//     while (!phone.test(emp.getPhoneNumberEmployees())){
//         alert("Phone invalid !!!");
//         emp.setPhoneNumberEmployees(prompt("Enter Phone Number Employees (035-230230230)  :"));
//     }
//     emp.setEmailEmployees(prompt("Enter Email Employees(ex:latu@gmail.com)   :"));
//     while (!em.test(emp.getEmailEmployees())){
//         alert("Email invalid");
//         emp.setEmailEmployees(prompt("Enter Email Employees(ex:latu@gmail.com)   :"));
//     }
//
//     emp.setAcademicLevelEmployees(prompt("Enter Academic Level Employees   :"));
//     emp.setJobPositionEmployees(prompt("Enter Job Position Employees   :"));
//
//     emp.setActualLaborDay(prompt("Enter Actual Labor Day   :"));
//     while (!workNumberDay.test(emp.getActualLaborDay())){
//         alert("Failed");
//         emp.setActualLaborDay(prompt("Enter Actual Labor Day   :"));
//
//     }
//     emp.setWorkingParts(prompt("Enter Working Parts (Manager,Sale,Marking )  :"));
//     listEmployees.push(emp);
//     displayMenuEmployess();
// }
//     function displayEmployees() {
//         let result ="";
//         for (let i = 0;i<listEmployees.length;i++){
//             result += "\n" + (i + 1) + "Name : " + listEmployees[i].getEmployeesName() +
//                 ";IsCard : " + listEmployees[i].getIsCardEmployees();
//         }
//         result += "\n" + (listEmployees.length + 1) + ".Back to Menu";
//         let chooseDisplayInfo  =prompt(result);
//         if (chooseDisplayInfo.toString()!==((listEmployees.length+1).toString())){
//             if (!checkDisplaySalary && !checkDeleteEmployees){
//
//                 displayInformationEmployees(Number.parseInt(chooseDisplayInfo)-1);}
//             else if (checkDeleteEmployees){
//
//                 deleteEmployees(Number.parseInt(chooseDisplayInfo)-1);
//             }
//             else {
//
//                 displayTotalSalary(Number.parseInt(chooseDisplayInfo)-1);
//             }
//         }else {
//
//             checkDeleteEmployees =false;
//             checkEditEmployees =false;
//             checkDisplaySalary =false;
//             displayMenuEmployess();
//         }
//
//     }
//     function displayInformationEmployees(index) {
//         if ( checkEditEmployees ) {
//             let chooseEdit = prompt(
//                 "\n1. Employees Name :" + listEmployees[index].getEmployeesName() +
//                 "\n2. Birthday Employees  :" + listEmployees[index].getBirthdayEmployees() +
//                 "\n3. Is Card Employees  :" + listEmployees[index].getIsCardEmployees() +
//                 "\n4. Phone NumberEmployees  :" + listEmployees[index].getPhoneNumberEmployees() +
//                 "\n4. Phone Email Employees  :" + listEmployees[index].getEmailEmployees() +
//                 "\n6. Academic LevelEmployees  :" + listEmployees[index].getAcademicLevelEmployees() +
//                 "\n7. Job Position Employees  :" + listEmployees[index].getJobPositionEmployees() +
//                 "\n8. Actual Labor Day  :" + listEmployees[index].getActualLaborDay() +
//                 "\n9. Working Parts  :" + listEmployees[index].getWorkingParts() +
//                 "\n 10.Back"
//             );
//             if (chooseEdit.toString()!=="10"){
//                 editInformationEmployees(index,Number.parseInt(chooseEdit)-1);
//             }else {
//                 checkEditEmployees =false;
//                 displayEmployees();
//             }
//         }else {
//             alert("Information of Employees in Hotel :"
//                 +"\n1. Employees Name :" +listEmployees[index].getEmployeesName()+
//                 "\n2. Birthday Employees  :" +listEmployees[index].getBirthdayEmployees()+
//                 "\n3. Is Card Employees  :" +listEmployees[index].getIsCardEmployees()+
//                 "\n4. Phone NumberEmployees  :" +listEmployees[index].getPhoneNumberEmployees()+
//                 "\n5. Phone Email Employees  :" +listEmployees[index].getEmailEmployees()+
//                 "\n6. Academic LevelEmployees  :" +listEmployees[index].getAcademicLevelEmployees()+
//                 "\n7. Job Position Employees  :" +listEmployees[index].getJobPositionEmployees()+
//                 "\n8. Actual Labor Day  :" +listEmployees[index].getActualLaborDay()+
//                 "\n9. Working Parts  :" +listEmployees[index].getWorkingParts()
//             );
//             displayMenuEmployess();
//         }
//     }
//     function editInformationEmployees(indexEm,indexPropety) {
//         console.log("-3");
//         let editInfo = prompt("Information you want to change of Employees");
//         switch (indexPropety) {
//             case 1:
//                 listEmployees[indexEm].getEmployeesName(editInfo);
//                 break;
//             case 2:
//                 listEmployees[indexEm].getBirthdayEmployees(editInfo);
//                 break;
//             case 3:
//                 listEmployees[indexEm].getIsCardEmployees(editInfo);
//                 break;
//             case 4:
//                 listEmployees[indexEm].getPhoneNumberEmployees(editInfo);
//                 break;
//             case 5:
//                 listEmployees[indexEm].getEmailEmployees(editInfo);
//                 break;
//             case 6:
//                 listEmployees[indexEm].getAcademicLevelEmployees(editInfo);
//                 break;
//             case 7:
//                 listEmployees[indexEm].getJobPositionEmployees(editInfo);
//                 break;
//             case 8:
//                 listEmployees[indexEm].getWorkingParts(editInfo);
//                 break;
//             default:
//                 alert("Failed");
//                 displayMenuEmployess();
//         }
//         checkEditEmployees =false;
//         displayMenuEmployess();
//     }
//     function chooseDeleteEmployees() {
//         checkDeleteEmployees = true;
//         displayEmployees();
//     }
//
//     function deleteEmployees(index) {
//         console.log("-2");
//         let chooseConfirm = prompt(
//             "Are you sure delete Customer : Name " + listEmployees[index].getEmployeesName() +
//             "; IsCard :" +listEmployees[index].getIsCardEmployees() +
//             "\n1.Yes\n2.No");
//         if (chooseConfirm === "1") {
//             listEmployees.splice(index, 1);
//             alert("Delete Completed");
//         }
//     }
//     function choosePaySalary() {
//         checkDisplaySalary =true;
//         displayEmployees();
//     }
//     function displayTotalSalary(index) {
//         alert(listEmployees[index].getSalaryEmployees());
//         checkDisplaySalary =false;
//         displayMenuEmployess();
//     }
//     function chooseEditEmployees() {
//         checkEditEmployees =true;
//         displayEmployees();
//     }
//     displayMenuEmployess();
// }