package com.alphas;

import com.alphas.dao.IDao;
import com.alphas.dao.StudentDao;
import com.alphas.entity.Student;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("v1")
public class LiberaryService {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("students")
    public List<Student> getAll(){
        IDao studentDao = new StudentDao();
        return studentDao.getAll();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("student")
    public Student addStudent(Student student){
        IDao studentDao = new StudentDao();
        System.out.println("called");
        studentDao.save(student);
        return student;
    }
    @GET
    @Path("test")
    public Response getResponse(){
        return Response.status(Response.Status.OK).entity("wekci").build();
    }
}
