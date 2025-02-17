package localyost.wlp.services;

import localyost.wlp.entities.Club;

import java.util.List;

public interface ClubService {

    Club addMembers(long clubId, List<Long> athleteIds);

}
