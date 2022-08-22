#!/bin/bash

echo "Criando diretórios"

mkdir /publico
mkdir /adm
mkdir /ven
mkdir /sec

echo "Diretórios criados"

echo "Criando grupos"

groupadd GRP_ADM
groupadd GRP_VEN
groupadd GRP_SEC

echo "Grupos criados"

echo "Atribuindo grupos aos diretórios"

chown root:GRP_ADM /adm
chown root:GRP_VEN /ven
chown root:GRP_SEC /sec

echo "Grupos atribuídos aos diretórios"

echo "Criando usuários e atribuindo aos respectivos grupos"

useradd carlos -m -c "Carlos" -s /bin/bash -G GRP_ADM -p $(openssl passwd 123)
useradd maria -m -c "Maria" -s /bin/bash -G GRP_ADM -p $(openssl passwd 123)
useradd joao -m -c "João" -s /bin/bash -G GRP_ADM -p $(openssl passwd 123)
useradd debora -m -c "Debora" -s /bin/bash -G GRP_VEN -p $(openssl passwd 123)
useradd sebastiana -m -c "Sebastiana" -s /bin/bash -G GRP_VEN -p $(openssl passwd 123)
useradd roberto -m -c "Roberto" -s /bin/bash -G GRP_VEN -p $(openssl passwd 123)
useradd josefina -m -c "Josefina" -s /bin/bash -G GRP_SEC -p $(openssl passwd 123)
useradd amanda -m -c "Amanda" -s /bin/bash -G GRP_SEC -p $(openssl passwd 123)
useradd rogerio -m -c "Rogério" -s /bin/bash -G GRP_SEC -p $(openssl passwd 123)

echo "Usuários criados com devidos grupos atribuídos"

echo "Configurando permissões"

chmod 777 /publico
chmod 770 /adm
chmod 770 /ven
chmod 770 /sec

echo "Permissões configuradas"

echo "Script finalizado"
