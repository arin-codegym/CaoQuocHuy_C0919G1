let Rat = function (name, mass, speed, live, speak) {
    this.name = name;
    this.mass = mass;
    this.getmass = function () {
        return this.mass = 1;
    };
    this.speed = speed;

    this.getspeed = function () {
        return this.speed = 10;
    };
    this.live = live;
    this.getlive = function () {
        this.live = Math.floor(Math.random() * 2);
        if (this.live===0){
            return this.live = "chet";
        } else {
            return this.live = "Song";
        }
    };
    this.speak= speak;
    this.getspeak=function () {
        return this.speak= "Chit chit";
    }
};