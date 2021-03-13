
class Admin extends Personne {
    constructor(nom, age, email, password) {
    super(nom, age);
    this._email
    = email;
    this.password
    = password;
    }
    get email() {
    return ("L'email est : ${this._email}");
    }
    set email(email) {
    if (email.includes("@")) {
    this._email
    = email;
    } else {
    console.log("email must contain @");
    }
    }
    this.log()= {
    super.log();
    console.log("cc");
    console.log("mon email est : ${this._email}");
    }
    }
    const admin = new Admin(
    "aymen sellaouti",
    38,
    "aymen.sellaouti@gmail.com",
    "123456"
    );
    admin.log();


