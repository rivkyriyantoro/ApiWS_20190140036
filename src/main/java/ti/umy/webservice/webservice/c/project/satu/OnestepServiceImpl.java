/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.webservice.webservice.c.project.satu;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author RIVKY RIYANTORO
 */
@Service
public class OnestepServiceImpl implements OnestepcleanService {
    
    @Autowired
    private OnestepcleanRepository repository;
    
    
    @Override
    public Memberone getMemberoneById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteMemberoneById(int id) {
        try{
            repository.deleteById(id);
        }
        catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<Memberone> getAllMemberone() {
        return repository.findAll();
    }

    @Override
    public Memberone addMemberone(Memberone memberone) {
        return repository.save(memberone);
    }

    @Override
    public void updateMemberone(Memberone memberone) {
        Memberone memberDB = repository.findById(memberone.getId()).orElseThrow();
        repository.save(memberone);}

  
    }

    
