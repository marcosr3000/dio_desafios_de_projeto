#!/bin/bash

echo "Atualizando servidor"

apt-get update -y
apt-get upgrade -y

echo "Servidor atualizado"

echo "Instalando Apache2"

apt-get install apache2 -y

echo "Apache2 instalado"

echo "Instalando Unzip"

apt-get install unzip -y

echo "Unzip instalado"

echo "Baixando aplicação do servidor"

wget -P /tmp https://github.com/denilsonbonatti/linux-site-dio/archive/refs/heads/main.zip

echo "Aplicação baixada"

echo "Descompactando arquivos da aplicação"

unzip /tmp/main.zip -d /tmp

echo "Arquivos da aplicação descompactados"

echo "Copiar arquivos da aplicação para o diretório Apache"

rm /var/www/html/index.html
cp -R /tmp/linux-site-dio-main/* /var/www/html

echo "Arquivos da aplicação copiados para o diretório Apache"

echo "Script finalizado"
