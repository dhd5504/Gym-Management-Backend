package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.Member;
import manager.gym.Gym.Manager.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
@CrossOrigin(origins = "http://localhost:3000")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public ResponseEntity<List<Member>> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/{memberId}")
    public ResponseEntity<Member> getMemberById(@PathVariable Integer memberId) {
        return new ResponseEntity<>(memberService.getMemberById(memberId), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Member> createMember(@RequestBody Member member) {
        return new ResponseEntity<>(memberService.createMember(member), HttpStatus.CREATED);
    }

    @PutMapping("/{memberId}")
    public ResponseEntity<Member> updateMember(@PathVariable Integer memberId, @RequestBody Member member) {
        return new ResponseEntity<>(memberService.updateMember(memberId, member),HttpStatus.OK);
    }

    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable Integer memberId) {
        memberService.deleteMember(memberId);
    }
}
