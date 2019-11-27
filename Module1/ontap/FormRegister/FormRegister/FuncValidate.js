var pattIdCard = /^[\d]{9}$/;

function checkIdCard(val) {
    return pattIdCard.test(val);
}
