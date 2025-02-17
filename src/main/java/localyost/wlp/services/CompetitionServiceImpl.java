package localyost.wlp.services;

import localyost.wlp.entities.Competition;
import localyost.wlp.repositories.CompetitionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CompetitionServiceImpl implements CompetitionService {

    private final CompetitionRepository competitionRepository;

    @Override
    public void startCompetition(long competitionId) {
        Optional<Competition> competition = competitionRepository.findById(competitionId);
        System.out.println(competition.isPresent());

    }
}
