/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;

import java.util.List;

/**
 *
 * @author Thokozani Mahlangu
 */
public class StudentManager 
{
    private StudentsDAO studentDAO;

    public StudentManager(StudentsDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
   
    public boolean studentExistsByEmail(String email)
    {
        return studentDAO.studentExistsByEmail(email);
    }
    
    public boolean studentExistsByStudentId(int studentId)
    {
        return studentDAO.studentExistsByStudentId(studentId);
    }

    public void addStudent(String firstName, String lastName, String email)
    {
        Student student = new Student(firstName, lastName, email);
        studentDAO.addToStudents(student);    
    }
    
    public List<Student> displayAllStudents()
    {
       List<Student> students = studentDAO.readStudents();
       return students;
    }
    
    public void studentUpdate(int studentId, Student student)
    {
        studentDAO.updateStudents(studentId, student);
    }
    
    public void deleteStudent(int studentId)
    {
        studentDAO.deleteFromStudents(studentId);
    }
    
    public List<Student> searchStudent(String keyword)
    {
        List<Student> searchResult = studentDAO.searchStudents(keyword);
        return searchResult;
    }
}
