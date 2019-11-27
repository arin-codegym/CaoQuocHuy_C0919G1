let dayNow = new Date();
let dayBirthDay = new Date(1989, 11, 11, 23, 0);
let dem = 0;

function checkYear(year) {
    let isLeapYear = false;
    /*c1*/
    let isDivisibleBy4 = year % 4 === 0;
    if (isDivisibleBy4) {
        let isDivisibleBy100 = year % 100 === 0;
        if (isDivisibleBy100) {
            let isDivisibleBy400 = year % 400 === 0;
            if (isDivisibleBy400) {
                isLeapYear = true;
            }
        } else {
            isLeapYear = true;
        }
    }
    if (isLeapYear) {
        // alert(year + " is a leap year");
        return dem++;
    } else {
        return 0;
        // alert(year + " is NOT a leap year");
    }
}

let namDaSong = dayNow.getFullYear() - dayBirthDay.getFullYear();
let thangDaSong = 12 * namDaSong;
let ngayDaSong;
if (dayNow.getMonth() > 2) {
    for (let i = dayBirthDay.getFullYear() + 1; i < dayNow.getFullYear(); i++) {

        dem += checkYear(i);

    }
    ngayDaSong= dayNow.getDay()*30+dem;
}
else if (dayNow.getMonth() <= 2) {
    for (let i = dayBirthDay.getFullYear() + 1; i < dayNow.getFullYear(); i++) {

        dem += checkYear(i);
    }
    ngayDaSong= namDaSong*12*30+dem;
}

 //= dayNow.getDay() * 30;
let gioDaSong = dayNow.getHours() * 24+(dem*24);
let phutDaSong = dayNow.getMinutes() * 60+(dem*24*60);
let giayDaSong = dayNow.getMinutes() * 60+(dem*24*60);


console.log('Tôi đã sống: ' + namDaSong + ' năm');
console.log('Tôi đã sống: ' + thangDaSong + ' tháng');
console.log('Tôi đã sống: ' + ngayDaSong + ' ngày');
console.log('Tôi đã sống: ' + gioDaSong + ' giờ');
console.log('Tôi đã sống: ' + phutDaSong + ' phút');
console.log('Tôi đã sống: ' + giayDaSong + ' giây');
let dayNow = new Date();
let dayBirthDay = new Date(1989,11,11,0,0);

let namDaSong = dayNow.getFullYear() - dayBirthDay.getFullYear();
let thangDaSong = namDaSong*12;
let ngayDaSong = thangDaSong*30;
let gioDaSong = ngayDaSong*24;
let phutDaSong = gioDaSong*60;
let giayDaSong = phutDaSong*60;
console.log(Date.prototype.getFullYear);

console.log('Tôi đã sống: ' + namDaSong + ' năm');
console.log('Tôi đã sống: ' + thangDaSong + ' tháng');
console.log('Tôi đã sống: ' + ngayDaSong + ' ngày');
console.log('Tôi đã sống: ' + gioDaSong + ' giờ');
console.log('Tôi đã sống: ' + phutDaSong + ' phút');
console.log('Tôi đã sống: ' + giayDaSong + ' giây');

