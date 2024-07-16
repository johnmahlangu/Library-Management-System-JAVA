/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.servlet;
import java.util.*;
/**
 *
 * @author Thokozani Mahlangu
 */
public interface StudentRepository 
{   
    List<Student> readStudents();
    boolean studentExistsByEmail(String email);
    boolean studentExistsByStudentId(int studentId);
    void addToStudents(Student user);
    void updateStudents(int userID, Student updateUser);
    void deleteFromStudents(int userID);
    List<Student> searchStudents(String keyword);
}
