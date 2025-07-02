
# 📚 Proyecto Java - Universidad-Depto

Este proyecto es un pequeño programa hecho en Java que simula cómo funciona una universidad con sus departamentos, profesores, estudiantes y cursos.  

---

## 🚀 ¿Qué hace este programa?

- Puedes **crear una universidad** y agregarle varios departamentos.
- Dentro de cada departamento, puedes **poner profesores** para que se hagan cargo.
- También puedes **crear cursos** y meter a estudiantes en ellos.
- Y al final, puedes pedirle que te **muestre un reporte bien bonito** de todo lo que hay.

---

## 🧩 ¿Cómo se conecta todo esto?

- La **universidad** tiene varios **departamentos** (si borras la universidad, se borran sus departamentos, porque dependen totalmente de ella).
- Los **profesores** trabajan en los departamentos, pero pueden existir por sí mismos sin problema (aunque no tengan un departamento todavía).
- Los **estudiantes** se pueden inscribir en varios **cursos**, y los cursos guardan una lista de qué estudiantes están inscritos (así que ambos saben del otro).
- Para hacer un resumen, hay un **GeneradorReporte** que arma el texto de cómo está organizada la universidad.

---

## 👀 ¿Qué puedes hacer con la aplicación?

- Agregar departamentos con sus respectivos profesores.
- Asignar profesores a departamentos después.
- Agregar cursos a los departamentos.
- Inscribir estudiantes en los cursos que quieras.
- Generar un reporte que te muestra cómo quedó todo.

---

## 🖥️ ¿Qué tecnologías de poo usa?

- Está hecho en **Java**, con clases normales, listas y demas.
- Usa **Swing** para la ventanita gráfica (botones, cuadros para escribir datos, etc).
- Implementa:
  - **Composición:** departamentos viven dentro de la universidad.
  - **Agregación:** profesores son independientes pero se asignan a departamentos.
  - **Asociación bidireccional:** estudiantes y cursos se apuntan entre sí.
  - **Dependencia:** el reporte depende de una clase externa para generarse.


---

## 🏆 Autor
 Joseph Quevedo

---
![image](https://github.com/user-attachments/assets/8a3c9cbe-277a-4ddb-9406-639790d46079)

![image](https://github.com/user-attachments/assets/69a915b6-dc0c-4330-93fe-1d821a5223fb)
![image](https://github.com/user-attachments/assets/4ce68d84-96cd-46ff-ae13-843fe989315c)

![image](https://github.com/user-attachments/assets/1a24cbea-ef09-4183-a766-7955fae7901f)

