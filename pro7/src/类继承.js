/**
 * @author dengshenkk@gmail.com
 * @version 1.0
 * @description 使用js重写Java教练和运动员案例
 * 分别有乒乓球运动员/教练和篮球运动员和/教练
 * 和乒乓球有关的人员需要说英语
 */

// 定义额外的方法 说英语
class SpeakEnglish {
    constructor({name, age, type}) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    speak() {
        console.log(this.name + " 他是一名" + this.type + " 他在说英语了~")
    }
}

// 定义人类
class Person {
    constructor({name, age, type, food}) {
        this.name = name;
        this.age = age;
        this.type = type
        this.food = food
    }

    sleep() {
        console.log(this.name + "已经睡觉了~");
    }

    eat() {
        console.log(this.name, "今天吃", this.food);
    }

    getInfo() {
        console.log("姓名: ", this.name, "年龄: ", this.age, "职业类型: ", this.type)
    }
}

// 运动员基类
class Player extends Person {
    constructor({name, age, type, food}) {
        super({name, age, type, food})
    }

    study() {
        console.log(this.name + "正在学习")
    }
}

// 定义乒乓球运动员
class PingpangBall extends Player {
    constructor({name, age, type, food}) {
        super({name, age, type, food})
    }

    speak() {
        return new SpeakEnglish({name: this.name, age: this.age, type: this.type}).speak()
    }
}

// 篮球运动员
class basketballPlayer extends Player {
    constructor({name, age, type, food}) {
        super({name, age, type, food})
    }
}

// 教练基类
class Coach extends Person {
    constructor({name, age, type, food}) {
        super({name, age, type, food})
    }

    teach() {
        console.log(this.name, "他是一名", this.type, "正在教学");
    }
}

// 乒乓球教练
class pingpangCocah extends Coach {
    constructor({name, age, type, food}) {
        super({name, age, type, food})
    }

    speak() {
        return new SpeakEnglish({name: this.name, age: this.age, type: this.type}).speak()
    }

    // 重写
    teach() {
        console.log(this.name, "他是一名", this.type, " 他正在教运动员发球/扣球")
    }
}

// 篮球教练
class basketball extends Coach {
    constructor({name, age, type, food}) {
        super({name, age, type, food})
    }

    // 重写
    teach() {
        console.log(this.name, "他是一名", this.type, " 他正在教运动员运球和投篮")
    }

}

let p1 = new PingpangBall({name: "1号乒乓球运动员", age: 18, type: "乒乓球运动员", food: "猪肉"})
p1.study()
p1.sleep()
p1.speak()
p1.eat()
p1.getInfo()
console.log('-------------');
//
let c1 = new pingpangCocah({name: "1号教练", age: 66, type: "乒乓球教练", food: "牛肉"})
c1.teach()
c1.sleep()
c1.speak()
c1.eat()
c1.getInfo()

console.log('============================================================');
let c2 = new basketball({name: "2号教练", age: 77, type: "篮球教练", food: "肥肉"})
c2.teach()
c2.sleep()
c2.eat()
// c2.speak() 没有说英语的方法 报错了
c2.getInfo()
console.log('-------------');

let b1 = new basketballPlayer({name: "2号篮球运动员", age: 22, type: "篮球运动员", food: "肌肉"})
b1.study()
b1.sleep()
// b1.speak()
b1.eat()