package roomescape.member.dto;

import roomescape.member.domain.Role;

public record LoginMemberInToken(
        Long id,
        Role role,
        String name,
        String email
) {
}
