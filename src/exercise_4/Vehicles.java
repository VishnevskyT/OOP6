package exercise_4;

/**
 * Завдання 4
 * Створіть проект за допомогою IntelliJ IDEA. Створіть перечислювальний тип (enum) Vehicles, що містить конструктор,
 * який повинен набувати цілого числа (вартість автомобіля), містити метод getColor(), який повертає рядок з кольором
 * автомобіля, і містити перевантажений метод toString(), який повинен повертати рядок з назвою екземпляра, кольором
 * та вартістю автомобіля.
 */
public enum Vehicles {
    Audi (100_000) {
        private String getColor() {
            return "Red";
        }

        @Override
        public String toString() {
            return super.toString() + " доступний у кольорі " + getColor() + " за " + getPrice() + " y.o.";
        }
    },
    BMW (150_000) {
        private String getColor() {
            return "Green";
        }
        @Override
        public String toString() {
            return super.toString() + " доступний у кольорі " + getColor() + " за " + getPrice() + " y.o.";
        }
    },
    Ford (70_000){

        private String getColor() {
            return "White";
        }
        @Override
        public String toString() {
            return super.toString() + " доступний у кольорі " + getColor() + " за " + getPrice() + " y.o.";
        }
    },
    Honda (90_000){
        private String getColor() {
            return "Black";
        }
        @Override
        public String toString() {
            return super.toString() + " доступний у кольорі " + getColor() + " за " + getPrice() + " y.o.";
        }
    },
    Kia (60_000) {
        private String getColor() {
            return "Grey";
        }
        @Override
        public String toString() {
            return super.toString() + " доступний у кольорі " + getColor() + " за " + getPrice() + " y.o.";
        }
    };

    final int price;

    Vehicles(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
