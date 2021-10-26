package de.htwg.aume.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Optional;
import java.util.UUID;

import lombok.val;

@SpringBootTest
public class MemberTest {

	@Test
	public void equal_works() {
		val memberID = UUID.randomUUID();
		val name = "John";
		val hexColor = "#ffffff";
		val avatar = AvatarAnimal.WOLF;
		Optional<Integer> estimation = Optional.empty();
		val member = new Member(memberID, name, hexColor, avatar, estimation);
		val sameMember = new Member(memberID, name, hexColor, avatar, estimation);
		val otherMember = new Member(UUID.randomUUID(), name, hexColor, avatar, estimation);

		assertEquals(member, sameMember);
		assertNotEquals(member, otherMember);
		assertEquals(member.hashCode(), sameMember.hashCode());
	}

	@Test
	public void copyWithMemberID_works() {
		val memberIdBefore = UUID.randomUUID();
		val memberIdAfter = UUID.randomUUID();
		val nameBefore = "John";
		val nameAfter = "Johnathan";
		val hexColor = "#ffffff";
		val avatar = AvatarAnimal.WOLF;
		Optional<Integer> estimation = Optional.empty();

		val member = new Member(memberIdBefore, nameBefore, hexColor, avatar, estimation);
		val result = member.copyWith(memberIdAfter, nameAfter, null, avatar, estimation);

		assertNotEquals(member.getMemberID(), result.getMemberID());
		assertEquals(result.getMemberID(), memberIdAfter);
		assertEquals(result.getName(), nameAfter);
		assertEquals(member.getHexColor(), result.getHexColor());
	}

}