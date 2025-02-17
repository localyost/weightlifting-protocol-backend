package localyost.wlp.services;

import localyost.wlp.entities.Athlete;
import localyost.wlp.entities.Club;
import localyost.wlp.repositories.AthleteRepository;
import localyost.wlp.repositories.ClubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class ClubServiceImpl implements ClubService {

    private final ClubRepository clubRepository;
    private final AthleteRepository athleteRepository;

    @Override
    public Club addMembers(long clubId, List<Long> athleteIds) {

        Optional<Club> clubOpt = clubRepository.findById(clubId);
        if (clubOpt.isPresent()) {
            List<Athlete> athletes = athleteRepository.findAllById(athleteIds);
            final Club club = clubOpt.get();
            club.getMembers().addAll(athletes);
            clubRepository.save(club);

            athletes.forEach(athlete -> athlete.setClub(club));
            athleteRepository.saveAll(athletes);
            return club;
        }
        return null;
    }
}
