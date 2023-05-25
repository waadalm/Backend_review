package com.example.review_backend;

public class Item {
String idCourse;
String courseName;
String courseDesc;
String courseDuration;
String cStartDate;
String cEndDate;
String cLevel;
String imageLink;
// 1
public String getidCourse(){
    return idCourse;
}
public void setidCourse(String idCourse){
    this.idCourse = idCourse;;
}

// 2
public String getCourseName(){
    return courseName;
}
public void setCourseName(String courseName){
    this.courseName = courseName;
}
// 3
public String getcourseDesc(){
    return courseDesc;
}
public void setcourseDesc(String courseDesc){
    this.courseDesc = courseDesc;
}
// 4
public String getcourseDuration(){
    return courseDuration;
}
public void setcourseDuration(String courseDuration){
    this.courseDuration = courseDuration;
}
// 5
public String getcStartDate(){
    return cStartDate;
}
public void setcStartDate(String cStartDate){
    this.cStartDate = cStartDate;
}
// 6
public String getcEndDate(){
    return cEndDate;
}
public void setcEndDate(String cEndDate){
    this.cEndDate = cEndDate;
}
// 7
public String getcLevel(){
    return cLevel;
}
public void setcLevel(String cLevel){
    this.cLevel = cLevel;
}

// 8
public String getimageLink(){
    return imageLink;
}
public void setcimageLink(String imageLink){
    this.imageLink = imageLink;
}


    
}
