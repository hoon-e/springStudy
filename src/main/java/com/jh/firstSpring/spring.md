# Spring Boot Tutorial

## Logic

Request,  Response

HTTP: GET, POST, DELETE, PUT

API layer, Controller Layer

---

Business Logic

Service Layer

---

Database

Data Access Layer

---

Model

Person
- ID
- name

---

- Optional 인스턴스는 모든 타입의 참조 변수를 저장할 수 있습니다.
- of() 또는 ofNullable() 메소드를 사용하여 Optional 객체를 생성할 수 있습니다.
- of() 메소드는 null이 아닌 명시된 값을 가지는 Optional 객체를 반환합니다.
- of() 메소드를 통해 생성된 Optional 객체에 null이 저장되면, NullPointerException이 발생합니다.
- ofNullable() 메소드는 명시된 값이 null이 아니면 명시된 값을 가지는 Optional 객체를 반환합니다.