package org.zerock.w1.todo.service;

import org.zerock.w1.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
    INSTANCE;

    public void register(TodoDTO todoDTO){
        System.out.println("DEBUG..........." + todoDTO);
    }
    public List<TodoDTO> getList(){
        List<TodoDTO> todoDTOS = IntStream.range(0,10).mapToObj(i -> {
            TodoDTO dto = new TodoDTO();
            dto.setTno((long)i);
            dto.setTitle("Todo.." +i);
            dto.setDueDate(LocalDate.now().atStartOfDay()); // 자바11버젼 이상부터만 LocalDatetime(날짜 + "시간")을 못씀.
//자바 8은 로컬데이트가 날짜만 가능한데 거기 +.atStartOfDay()를 추가하면 시간도 됨.
            return dto;
        }).collect(Collectors.toList());

        return todoDTOS;
    }

    public TodoDTO get(Long tno){

        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("Sample Todo");
        dto.setDueDate(LocalDate.now().atStartOfDay());
        dto.setFinished(true);

        return dto;
    }
}
