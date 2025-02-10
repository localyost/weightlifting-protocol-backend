package localyost.wlp.controllers;

import localyost.wlp.repositories.CompetitionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/competitions")
public class CompetitionController {

    private final CompetitionRepository competitionRepository;

    @PostMapping("/start/{id}")
    public ResponseEntity<?> customSearch(@PathVariable Long id) {

        competitionRepository.start(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
