package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;

public class RecoveryRoomService {
	
	private RecoveryRoomRepository recoveryRoomRepository;
	
    public List<RecoveryRoom> getAll(){
    	List<RecoveryRoom> r = recoveryRoomRepository.findAll();
    	
        return r;
    }

    public List<RecoveryRoomType> getAllRecoveryRoomTypes(){
        return null;
    }

    public RecoveryRoomType getRecoveryRoomType(String typeName) {
        return null;
    }

    public List<RecoveryRoom> getRecoveryRoomsBiggerThan(double size) {
        return null;
    }

    public RecoveryRoom save(RecoveryRoom p) {
        return null;       
    }

    
}
