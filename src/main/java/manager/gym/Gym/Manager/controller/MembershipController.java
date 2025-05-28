package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.Membership;
import manager.gym.Gym.Manager.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/memberships")
@CrossOrigin(origins = "http://localhost:3000")
public class MembershipController {
    private final MembershipService membershipService;

    @Autowired
    public MembershipController(MembershipService membershipService) {
        this.membershipService = membershipService;
    }

    @GetMapping
    public ResponseEntity<List<Membership>> getAllMemberships() {
        return new ResponseEntity<>(membershipService.getAllMemberships(),HttpStatus.OK);
    }

    @GetMapping("/{membershipId}")
    public ResponseEntity<Membership> getMembershipById(@PathVariable Integer membershipId) {
        return new ResponseEntity<>(membershipService.getMembershipById(membershipId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Membership> createMembership(@RequestBody Membership membership) {
        return new ResponseEntity<>(membershipService.createMembership(membership), HttpStatus.OK);
    }

    @PutMapping("/{membershipId}")
    public ResponseEntity<Membership> updateMembership(@PathVariable Integer membershipId, @RequestBody Membership membership) {
        return new ResponseEntity<>(membershipService.updateMembership(membershipId, membership), HttpStatus.OK);
    }

    @DeleteMapping("/{membershipId}")
    public void deleteMembership(@PathVariable Integer membershipId) {
        membershipService.deleteMembership(membershipId);
    }
}
