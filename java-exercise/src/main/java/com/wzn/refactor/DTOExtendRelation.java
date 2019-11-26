package com.wzn.refactor;

import lombok.Data;

import java.io.Serializable;

@Data
public class DTOExtendRelation {
    public static void main(String[] args) {
        DTOExtendRelation dtoExtendRelation = new DTOExtendRelation();
        dtoExtendRelation.create();
        dtoExtendRelation.delete();
    }
    private void create() {
        CreateRequestDTO createDTO = new CreateRequestDTO();
        createDTO.setId("no.1");
        createDTO.setPath("path");
        doSomething(createDTO);
    }

    private void delete(){
        DeleteRequestDTO deleteDTO = new DeleteRequestDTO();
        deleteDTO.setMessage("delete success");
        doSomething(deleteDTO);
    }

    private void doSomething(BaseRequestDTO operationDTO) {
        System.out.println(operationDTO.getId());
    }

}

@Data
class BaseRequestDTO implements Serializable {
    private String id;
    private String name;
    private String type;
}

@Data
class CreateRequestDTO extends BaseRequestDTO {
    private String password;
    private String path;
}

@Data
class DeleteRequestDTO extends BaseRequestDTO {
    private String password;
    private Boolean isDelete;
    private String message;
}