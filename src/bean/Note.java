/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author lenovo
 */
public class Note {
    private int id;
    private int note;//-1 po note
    private int noteCoefficient;
    private Etudiant etudiant;
    private Exam exam;

    public Note() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Etudiant getEtudiant() {
        if(etudiant==null){
           etudiant=new Etudiant();
        }
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Exam getExam() {
         if(exam==null){
            exam=new Exam();
        }
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "Note{" + "id=" + id + ", note=" + note + ", etudiant=" + etudiant + ", exam=" + exam + '}';
    }

    public int getNoteCoefficient() {
        return noteCoefficient;
    }

    public void setNoteCoefficient(int noteCoefficient) {
        this.noteCoefficient = noteCoefficient;
    }
    
    
}
