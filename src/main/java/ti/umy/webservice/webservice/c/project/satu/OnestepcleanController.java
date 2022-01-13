/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.webservice.webservice.c.project.satu;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RIVKY RIYANTORO
 */
@RestController
@CrossOrigin
@RequestMapping("/onestepclean")
public class OnestepcleanController {
    @Autowired
    OnestepcleanService OnestepcleanService;
    
    @GetMapping
    public List<Memberone>getAllMemberone(){
        return OnestepcleanService.getAllMemberone();
    }
    
    @PostMapping
    @ResponseStatus
    public Memberone addMemberone(@RequestBody Memberone memberone){
        return OnestepcleanService.addMemberone(memberone);
    }
    
    @GetMapping("/{id}")
    public Memberone getMemberoneById(@PathVariable("id") int id){
        return OnestepcleanService.getMemberoneById(id);
    }
    
    @PutMapping("/updateonestepclean")
    public ResponseEntity<String> updateMemberone(@RequestBody Memberone memberone){
        try{
            OnestepcleanService.updateMemberone(memberone);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMemberone(@PathVariable int id){
        try{
            OnestepcleanService.deleteMemberoneById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     
        }
    }
}
