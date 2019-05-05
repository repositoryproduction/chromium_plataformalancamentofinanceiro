var gerenciadorPessoaModule = angular.module("gerenciadorPessoaModule", []);

gerenciadorPessoaModule.controller("gerenciadorPessoaController", function($scope, $http) {

	$scope.gerenciadorPessoaModel = {};
	
	$scope.gerenciadorPessoaModelList = [];
	
	/**
     * Funcionalidade: Responsavel por recuperar os dados do cadastro de pessoas
	 * URL do Servico de Gerenciador de Pessoa
     */
    URL_PESSOA_SERVICE = 'http://localhost:8080/plataformalancamentofinanceiro-1.0.0.1-SNAPSHOT/plataformalancamentofinanceiro/gerenciadorPessoaResource';
	
    /**
     * Funcionalidade: Responsavel por recuperar os dados do 'Gerenciador de Pessoa'
     */
    $http.get(URL_PESSOA_SERVICE).then(function(response) {
        $scope.gerenciadorPessoaModelList = response.data;
    });
    
    /**
     * Funcionalidade: 	Responsavel por Editar os dados de Gerenciador de Pessoa
     * Acao:           	Carrega o objeto da 'view' para o 'controller'
     * */
    $scope.merge = function(gerenciadorPessoaModelSelecionado) {
    	$scope.gerenciadorPessoaModel = angular.copy(gerenciadorPessoaModelSelecionado);
    };
    
});