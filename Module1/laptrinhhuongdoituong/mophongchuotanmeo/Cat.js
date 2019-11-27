let Cat=function (name,mass,maxspeed,speak) {
    this.name=name;
    this.mass=10;
    this.getmass=function () {
        return this.mass ;
    };
    this.maxspeed=maxspeed;
    this.getmaxspeed=function () {
        return this.maxspeed= Math.floor(Math.random()*20);
    };
    this.speak = speak;
    this.getspeak = function () {
        this.speak="Meow meow";
    };

    this.geteat=function () {
         return this.mass ++;
            }
};