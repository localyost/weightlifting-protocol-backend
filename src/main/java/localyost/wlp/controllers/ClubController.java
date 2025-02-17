package localyost.wlp.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import localyost.wlp.entities.Club;
import localyost.wlp.services.ClubService;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clubs")
public class ClubController {

    private final ClubService clubService;

    @Data
    static class AthleteIdsRequest {
        private List<Long> athleteIds;
    }

    @PostMapping("/{clubId}/addMembers")
    public ResponseEntity<Club> addMembers(@PathVariable long clubId, @RequestBody AthleteIdsRequest body) throws JsonProcessingException {
        clubService.addMembers(clubId, body.getAthleteIds());

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
