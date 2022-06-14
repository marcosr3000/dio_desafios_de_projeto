import React from 'react';
import * as S from './styled';

function Profile() {
  return (
    <S.Wrapper>
          
          <S.WrapperImage src="https://avatars.githubusercontent.com/u/103574980?v=4" alt="Avatar of user" />
          <S.WrapperInfoUser>
            <div>
                <h1>Marcos Roberto</h1>
                <S.WrapperStatusUsername>
                    <h3>Username: </h3>
                    <a href="https://github.com/marcosr3000" target="_blank" rel="noreferrer">marcosr3000</a>
                </S.WrapperStatusUsername>
            </div>
            <S.WrapperStatusCount>
                <div>
                    <h4>Followers</h4>
                    <span>5</span>
                </div>
                <div>
                    <h4>Starred</h4>
                    <span>5</span>
                </div>
                <div>
                    <h4>Followings</h4>
                    <span>5</span>
                </div>
            </S.WrapperStatusCount>
          </S.WrapperInfoUser>
        
    </S.Wrapper>
  )
}

export default Profile;