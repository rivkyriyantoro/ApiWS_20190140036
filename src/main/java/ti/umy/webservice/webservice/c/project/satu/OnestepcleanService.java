/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ti.umy.webservice.webservice.c.project.satu;

import java.util.List;

/**
 *
 * @author RIVKY RIYANTORO
 */
public interface OnestepcleanService {
    Memberone addMemberone(Memberone memberone);
    Memberone getMemberoneById(int id);
    void updateMemberone(Memberone memberone);
    void deleteMemberoneById(int id);
    List<Memberone>getAllMemberone();
      
}
