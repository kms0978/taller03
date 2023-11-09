Taller práctico 3:

CLASES: 
- Atleta: atributos=nombre,pais,edad y disciplinas/métodos=getters,setters,constructor,agregarDisciplinas(),eliminarDisciplinas(),mostrarInfoAtleta()
- Disciplina: atributos=nombreDisciplina,num_participantes y recordMundial/métodos=getters,setters,constructor,mostrarInfoDisciplina()
- Equipo: atributos=nombreEquipo,atletas y disciplinaEquipo/métodos=getters,setters,constructor,agregarAtleta(),eliminarAtleta(),mostrarInfoEquipo()
- Evento: disciplina,fecha y tipo(individual o en equipo)/métodos=esEnEquipo(),agregarAtleta(),eliminarAtleta()

RELACIONES:
- Asociación entre la clase Evento y Atleta
- Asociación entre la clase Evento y Equipo
- Agregación entre la clase Atleta y Equipo
- Agregación entre la clase Disciplina y Equipo
- Composición entre la clase Disciplina y Atleta
- Dependencia entre la clase Evento y Disciplina