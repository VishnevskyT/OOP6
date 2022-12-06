package exercise_2;

/**
 * Завдання 2
 * Створіть проект за допомогою IntelliJ IDEA. Створіть перерахунковий тип (enum) Animals, що містить конструктор,
 * який повинен набувати цілого числа (вік тварини), і містити перевантажений метод toString(), який повинен
 * повертати назву екземпляра та вік тварини.
 */

public enum Animals {
    griffon(10.2) {
        @Override
        public String toString() {
            return super.toString() + " віком " + getYear() + " вже чекає на тебе.";
        }
    },
    ferret(3.1) {
        @Override
        public String toString() {
            return super.toString() + " віком " + getYear() + " років знаходиться у безпеці.";
        }
    },
    stoat(2.7) {
        @Override
        public String toString() {
            return super.toString() + " віком " + getYear() + " років була випущена на волю.";
        }
    },
    blackStork(0.9){
        @Override
        public String toString() {
            return super.toString() + " віком " + getYear() + " років збільшила свою популяцію.";
        }
    },
    corsacFox(5.0){
        @Override
        public String toString() {
            return super.toString() + " віком " + getYear() + " років потребує додаткового фінансування";
        }
    };

    final double year;

    Animals(double year) {
        this.year = year;
    }

    public double getYear() {
        return year;
    }
    public String toString() {
        return "Червонокнижка тваринка " + this.name();
    }

}
