# Game-Todo

## 1. プロジェクトの初期設定

- プロジェクトのルートディレクトリを作成します。

## 2. フロントエンドのセットアップ

1. ルートディレクトリで以下のコマンドを実行し、`gt-front`プロジェクトをVue.jsで作成します。
    ```
    vue create gt-front
    ```
2. `gt-front`ディレクトリに移動し、`axios`をインストールします。
    ```
    cd gt-front
    npm install axios
    ```

## 3. バックエンドとE2Eテストのディレクトリ作成

- ルートディレクトリに戻り、`gt-back`と`e2e`フォルダを作成します。
    ```
    cd ..
    mkdir gt-back e2e
    ```

## 4. Docker設定

1. `gt-back`フォルダ直下に`Dockerfile`を作成します。
2. ルートディレクトリ直下に`environment`フォルダを作成し、その中に`docker-compose.yml`ファイルを配置します。

## 5. Gradle設定

- ルートディレクトリに`settings.gradle.kts`ファイルを作成し、以下の内容を記述します。
    ```kotlin
    rootProject.name = "game-todo"
    include("gt-back")
    include("e2e")
    ```
- `gt-back`と`e2e`フォルダ直下にそれぞれ`build.gradle.kts`を作成し、プロジェクトのビルド設定を定義します。

## 6. プロジェクトのビルドとテストの実行

このセクションでは、Docker環境の準備、フロントエンド開発サーバーの起動、バックエンドアプリケーションの実行、そしてE2Eテストの実行方法について説明します。

### Dockerコンテナの起動

Dockerを使用してバックエンドやその他の依存サービスをコンテナとして起動します。これにより、開発環境の一貫性と、他の開発者やCI/CDパイプラインとの互換性が保証されます。

```shell
cd environment
docker compose up -d
cd ..
```

### フロントエンドの開発サーバーの起動

フロントエンドの開発環境をセットアップし、リアルタイムでの変更の確認や、開発中のフロントエンドアプリケーションのテストが可能になります。

```shell
cd gt-front
npm run dev
cd ..
```

### バックエンドアプリケーションの実行

バックエンドアプリケーションをローカルで実行し、APIエンドポイントが正しく機能することを確認します。

```shell
cd gt-back
./gradlew bootRun
```

### E2Eテストの実行

エンドツーエンドテストを実行して、アプリケーションのフロントエンドとバックエンドが正しく連携して動作することを確認します。テストはe2eディレクトリ内で実行されます。

```shell
cd e2e
// ここでE2Eテストスクリプトを実行します。
```

以上の手順に従うことで、プロジェクトのビルドからテスト実行までのプロセスをスムーズに進めることができます。開発の各段階で適切なサービスが起動していることを確認し、問題があれば適宜デバッグしてください。

```shell
mkdir -p gt-back/src/main/kotlin
mkdir -p gt-back/src/main/resources
mkdir -p gt-back/src/test/kotlin
mkdir -p gt-back/src/test/resources
mkdir -p gt-back/build

mkdir -p e2e
mkdir -p e2e/specs
mkdir -p e2e/src/test
mkdir -p e2e/env
mkdir -p e2e/data
mkdir -p e2e/reports
```
