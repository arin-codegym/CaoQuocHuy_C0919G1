let noi = document.getElementById("noi");
let name = document.getElementById("name");
let gender = document.getElementById("gender");
let weight = document.getElementById("weight");
let apple = document.getElementById("creatApple");
let array = [];
let sp;
let app;
function speak() {
    sp = new Human();
    sp.setSpeak(noi.value);
    sp.setName(name.value);
    sp.setWeight(weight.value * 1);
    sp.setGender(gender.value);
    array.push(sp);
    alert("added");
}

function createApple() {
    app = new Apple();
    app.setKhoiLuong(apple.value );
    result =app.getKhoiLuong();
    alert("added");
}

function display() {
    let result="";
    for (let i=0;i<array.length;i++){
        result+="tên là:"+array[i].getName()+" giới tính: "+array[i].getGender()
            +"cân nặng là: "+array[i].getWeight()+"\n";
    }
    alert(result);
}
function eatApple() {
    result="khối lượng táo sau khi ăn là:"+app.decrease()+"và cân nặng là:"+sp.upWeight();
    app.setKhoiLuong(app.decrease());//set lại giá trị được giảm sau đó tiếp tục giảm tiếp
    sp.setWeight(sp.upWeight());
    alert(result);
}