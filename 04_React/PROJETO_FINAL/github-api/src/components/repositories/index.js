import React from 'react'
import RepositoryItem from '../repository-item';
import * as S from "./styled";

function Repositories () {
  return (
    <S.WrapperTabs
      selectedTabClassName='is-selected'
      selectedTabPanelClassName='is-selected'  
      >
        <S.WrapperTablist>
            <S.WrapperTab>Repositories</S.WrapperTab>
            <S.WrapperTab>Starred</S.WrapperTab>
        </S.WrapperTablist>
        <S.WrapperTabPanel>
            <RepositoryItem 
                name="armario-dos-games"
                linkToRepo="https://github.com/marcosr3000/armario-dos-games"
                fullName="marcosr3000/armario-dos-games"
            />
        </S.WrapperTabPanel>
        <S.WrapperTabPanel>
            <RepositoryItem 
                name="portfolio" 
                linkToRepo="https://github.com/marcosr3000/portfolio"
                fullName="marcosr3000/portifolio"
            />
        </S.WrapperTabPanel>
    </S.WrapperTabs>
  )
}

export default Repositories