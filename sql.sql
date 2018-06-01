

Select aluno.nome from aluno inner join aluno_turno on aluno.id = aluno_turno.aluno_id inner join turma on aluno_turno.id_turma = turma.id inner join professor prof on prof.id = turma.professor_id where prof.nome = `JOAOPEDRO`

Select Distinct(Turma.dia_semana) from disciplina inner join turma on disciplina.id = turma.disciplina_id where disciplina.nome = ‘MATEMATICA’

Select aluno.nome from aluno a inner join (Select * from aluno inner join aluno_turno on aluno.id = aluno_turno.aluno_id inner join turma on aluno_turno.id_turma = turma.id inner join disciplina on disciplina.id = turma.disciplina_id where disciplina.nome = ‘FISICA’) on a.id = aluno.id    inner join aluno_turno on aluno.id = aluno_turno.aluno_id inner join turma on aluno_turno.id_turma = turma.id inner join disciplina on disciplina.id = turma.disciplina_id where disciplina.nome = ‘MATEMATICA’

Select Distinct(disciplina) from disciplina left join turma on disciplina.id != turma.disciplina_id  

Select aluno.nome from aluno a inner join (Select * from aluno inner join aluno_turno on aluno.id = aluno_turno.aluno_id inner join turma on aluno_turno.id_turma = turma.id inner join disciplina on disciplina.id = turma.disciplina_id where disciplina.nome = ‘QUIMICA’) on a.id != aluno.id  inner join aluno_turno on aluno.id = aluno_turno.aluno_id inner join turma on aluno_turno.id_turma = turma.id inner join disciplina on disciplina.id = turma.disciplina_id where disciplina.nome = ‘MATEMATICA’

